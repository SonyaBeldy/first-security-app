package ru.sonyabeldy.FirstSecurityApp.services;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.sonyabeldy.FirstSecurityApp.models.Person;
import ru.sonyabeldy.FirstSecurityApp.repositories.PeopleRepository;

@Service
public class RegistrationService {

    public final PeopleRepository peopleRepository;

    @Autowired
    public RegistrationService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    @Transactional
    public void register(Person person) {
        peopleRepository.save(person);
    }
}
