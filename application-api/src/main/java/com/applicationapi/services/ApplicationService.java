package com.applicationapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import com.applicationapi.domains.Application;
// import com.applicationapi.repositories.ApplicationRepository;
// import com.applicationapi.repositories.ApplicationRepository;
import com.applicationapi.repositories.ApplicationRepository;

@Service
// @EnableMongoRepositories(basePackageClasses = ApplicationRepository.class)
public class ApplicationService {

    @Autowired
    private ApplicationRepository applicationRepository;
    // private MongoTemplate mongoTemplate;
    
    public ApplicationService(ApplicationRepository applicationRepository) {
        this.applicationRepository = applicationRepository;
    }

    public Application addApplication(Application application) {
        return applicationRepository.save(application);
    }
    
    public List<Application> getApplications() {
        return applicationRepository.findAll();
    }
}
