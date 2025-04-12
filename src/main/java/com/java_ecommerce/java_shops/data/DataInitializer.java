package com.java_ecommerce.java_shops.data;

import com.java_ecommerce.java_shops.model.User;
import com.java_ecommerce.java_shops.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class DataInitializer implements ApplicationListener<ApplicationReadyEvent> {
    private final UserRepository userRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {
        createDefaultUserIfNotExists();
    }

    private void createDefaultUserIfNotExists() {
        for (int i = 1; i <= 5; i++) {
            String defaultEmail = "user" + i + "@gmail.com";
            if (userRepository.existsByEmail(defaultEmail)) {
                continue;
            }

            User user = new User();
            user.setFirstName("First Name " + i);
            user.setLastName("Last Name " + i);
            user.setEmail(defaultEmail);
            user.setPassword("password" + i);
            userRepository.save(user);
            System.out.println("User " + i + " created successfully");
        }
    }
}
