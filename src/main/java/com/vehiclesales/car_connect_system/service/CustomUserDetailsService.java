// // package com.vehiclesales.car_connect_system.service;

// // import org.springframework.beans.factory.annotation.Autowired;
// // import org.springframework.security.core.userdetails.UserDetails;
// // import org.springframework.security.core.userdetails.UserDetailsService;
// // import org.springframework.security.core.userdetails.UsernameNotFoundException;
// // import org.springframework.stereotype.Service;

// // // import com.vehiclesales.car_connect_system.observer.User;
// // import com.vehiclesales.car_connect_system.repository.UserRepository;

// // @Service
// // public class CustomUserDetailsService implements UserDetailsService {
// //     @Autowired
// //     private UserRepository userRepository;

// //     @Override
// //     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
// //         com.vehiclesales.car_connect_system.model.User user = userRepository.findByUsername(username)
// //             .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
// //         return user;
// //     }
// // }
// package com.vehiclesales.car_connect_system.service;

// import com.vehiclesales.car_connect_system.model.User;
// import com.vehiclesales.car_connect_system.repository.UserRepository;
// // import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.security.core.userdetails.UserDetailsService;
// import org.springframework.security.core.userdetails.UsernameNotFoundException;
// import org.springframework.stereotype.Service;

// @Service
// public class CustomUserDetailsService implements UserDetailsService {

//     private final UserRepository userRepository;

//     // @Autowired
//     public CustomUserDetailsService(UserRepository userRepository) {
//         this.userRepository = userRepository;
//     }

//     @Override
//     public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//         User user = userRepository.findByUsername(username)
//             .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
//         return user;
//     }
// }
package com.vehiclesales.car_connect_system.service;

import com.vehiclesales.car_connect_system.model.User;
import com.vehiclesales.car_connect_system.repository.UserRepository;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    // @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username)
            .orElseThrow(() -> new UsernameNotFoundException("User not found with username: " + username));
        return user;
    }
}