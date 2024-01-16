package com.applicationapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.applicationapi.domains.Application;
import com.applicationapi.services.ApplicationService;
import com.applicationapi.services.ExcelService;

// import com.applicationapi.domains.Application;
// import com.applicationapi.services.ApplicationService;

@RestController
public class ApplicationResource {

    @Autowired
    private ApplicationService applicationService;

    @Autowired
    private ExcelService excelService;

    public ApplicationResource(ApplicationService applicationService, ExcelService excelService) {
        this.applicationService = applicationService;
        this.excelService = excelService;
    }


    @GetMapping("/test")
    public String test() {
        return "test OK";
    }

    @GetMapping("/upload")
    public Object upload() {
        return excelService.readExcel("C:\\Users\\mouau\\OneDrive\\Documents\\recherche_emploi_2024.xls");
    }

    @PostMapping("/applications")
    public Application addApplication(@RequestBody Application application) {
        return applicationService.addApplication(application);
    }

    @GetMapping("/applications")
    public List<Application> getApplications() {
        return applicationService.getApplications();
    }
}