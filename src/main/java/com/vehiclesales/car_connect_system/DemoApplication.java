package com.vehiclesales.car_connect_system;

import java.util.Arrays;
import java.util.List;

import com.vehiclesales.car_connect_system.adapter.PDFDocumentAdapter;
import com.vehiclesales.car_connect_system.bridge.Form;
import com.vehiclesales.car_connect_system.bridge.FormRenderer;
import com.vehiclesales.car_connect_system.bridge.HTMLFormRenderer;
import com.vehiclesales.car_connect_system.bridge.OrderForm;
import com.vehiclesales.car_connect_system.bridge.RegistrationForm;
import com.vehiclesales.car_connect_system.bridge.WidgetFormRenderer;
import com.vehiclesales.car_connect_system.builder.DocumentBundleBuilder;
import com.vehiclesales.car_connect_system.builder.HTMLDocumentBundleBuilder;
import com.vehiclesales.car_connect_system.builder.PDFDocumentBundleBuilder;
import com.vehiclesales.car_connect_system.composite.Company;
import com.vehiclesales.car_connect_system.composite.CompanyGroup;
import com.vehiclesales.car_connect_system.decorator.VehicleAnimationDecorator;
import com.vehiclesales.car_connect_system.external.PDFBoxLibrary;
import com.vehiclesales.car_connect_system.factory.ElectricVehicleFactory;
import com.vehiclesales.car_connect_system.factory.OrderFactory;
import com.vehiclesales.car_connect_system.factory.VehicleFactory;
import com.vehiclesales.car_connect_system.iterator.VehicleCatalogueImpl;
import com.vehiclesales.car_connect_system.iterator.VehicleIterator;
import com.vehiclesales.car_connect_system.model.Car;
import com.vehiclesales.car_connect_system.model.CashOrder;
import com.vehiclesales.car_connect_system.model.DocumentBundle;
import com.vehiclesales.car_connect_system.model.Orrder;
import com.vehiclesales.car_connect_system.model.Vehicle;
import com.vehiclesales.car_connect_system.observer.Subject;
import com.vehiclesales.car_connect_system.observer.User;
import com.vehiclesales.car_connect_system.singleton.BlankDocumentBundle;
import com.vehiclesales.car_connect_system.template.CashOrderCalculator;
import com.vehiclesales.car_connect_system.template.CreditOrderCalculator;
import com.vehiclesales.car_connect_system.template.OrderCalculator;

public class DemoApplication {

    public static void main(String[] args) {
              // Create a vehicle
        VehicleFactory electricFactory = new ElectricVehicleFactory();
        Vehicle electricCar = electricFactory.createCar("Tesla", 60000);

        // Create a cash order
        Orrder cashOrder = OrderFactory.createOrder("ORD123", electricCar, "cash");
        cashOrder.processPayment();
        System.out.println(cashOrder);

        // Create a credit order
        Orrder creditOrder = OrderFactory.createOrder("ORD456", electricCar, "credit");
        creditOrder.processPayment();
        System.out.println(creditOrder);


           // Create a PDF document bundle
        DocumentBundleBuilder pdfBuilder = new PDFDocumentBundleBuilder();
        pdfBuilder.addRegistrationForm();
        pdfBuilder.addTransferCertificate();
        pdfBuilder.addOrderForm();
        DocumentBundle pdfBundle = pdfBuilder.getBundle();
        pdfBundle.printBundle();

        // Create an HTML document bundle
        DocumentBundleBuilder htmlBuilder = new HTMLDocumentBundleBuilder();
        htmlBuilder.addRegistrationForm();
        htmlBuilder.addTransferCertificate();
        htmlBuilder.addOrderForm();
        DocumentBundle htmlBundle = htmlBuilder.getBundle();
        htmlBundle.printBundle();

         // Get the singleton instance
        BlankDocumentBundle blankBundle = BlankDocumentBundle.getInstance();
        DocumentBundle bundle = blankBundle.getBundle();

        // Print the blank document bundle
        System.out.println("Blank Document Bundle1:");
        bundle.printBundle();

        // Use the adapter to create and save the PDF
        PDFDocumentAdapter pdfAdapter = new PDFDocumentAdapter(new PDFBoxLibrary());
        pdfAdapter.createAndSavePDF(pdfBundle, "order_documents.pdf");

         // Render forms as HTML
        FormRenderer htmlRenderer = new HTMLFormRenderer();
        Form registrationForm = new RegistrationForm(htmlRenderer);
        Form orderForm = new OrderForm(htmlRenderer);

        registrationForm.render();
        orderForm.render();

        // Render forms as widgets
        FormRenderer widgetRenderer = new WidgetFormRenderer();
        Form widgetRegistrationForm = new RegistrationForm(widgetRenderer);
        Form widgetOrderForm = new OrderForm(widgetRenderer);

        widgetRegistrationForm.render();
        widgetOrderForm.render();

         // Create individual companies
        Company company1 = new Company("Company A");
        Company company2 = new Company("Company B");
        Company company3 = new Company("Company C");

        // Create a company group with subsidiaries
        CompanyGroup group1 = new CompanyGroup("Group X");
        group1.addSubsidiary(company1);
        group1.addSubsidiary(company2);

        // Create another company group
        CompanyGroup group2 = new CompanyGroup("Group Y");
        group2.addSubsidiary(group1);
        group2.addSubsidiary(company3);

        // Display the hierarchy
        group2.display();

         // Create a vehicle and decorate it with animations
        Vehicle car1 = new Car("Tesla", 60000, "Electric");
        Vehicle animatedCar = new VehicleAnimationDecorator(car1);
        animatedCar.display();

        // Create a subject and observers
        Subject catalogue1 = new Subject();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Add observers to the subject
        catalogue1.addObserver(user1);
        catalogue1.addObserver(user2);

        // Notify observers of a catalogue update
        catalogue1.notifyObservers("New vehicle added: " + car1.getModel());
         // Create a list of vehicles
        List<Vehicle> vehicles = Arrays.asList(
            new Car("Tesla", 60000, "Electric"),
            new Car("Toyota", 30000, "Petrol"),
            new Car("BMW", 50000, "Electric")
        );

        // Create a catalogue and iterator
        VehicleCatalogueImpl catalogue2 = new VehicleCatalogueImpl(vehicles);
        VehicleIterator iterator = catalogue2.createIterator();

        // Iterate through the catalogue
        while (iterator.hasNext()) {
            Vehicle vehicle = iterator.next();
            System.out.println(vehicle);
        }

         // Create a vehicle and order
        Car car2 = new Car("Tesla", 60000, "Electric");
        Orrder order = new CashOrder("ORD123", car2, "In Progress");
        //orrder
        // Calculate total for cash order
        OrderCalculator cashCalculator = new CashOrderCalculator();
        double cashTotal = cashCalculator.calculateTotal(order);
        System.out.println("Cash Order Total: $" + cashTotal);

        // Calculate total for credit order
        OrderCalculator creditCalculator = new CreditOrderCalculator();
        double creditTotal = creditCalculator.calculateTotal(order);
        System.out.println("Credit Order Total: $" + creditTotal);
    }
}