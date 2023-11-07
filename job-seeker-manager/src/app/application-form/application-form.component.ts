import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';
import { ApplicationService } from '../application.service';
import { Application } from '../application';

@Component({
  selector: 'app-application-form',
  templateUrl: './application-form.component.html',
  styleUrls: ['./application-form.component.css']
})
export class ApplicationFormComponent {

  constructor(private formBuilder: FormBuilder,
    private applicationService: ApplicationService) {

  }

  applicationForm = this.formBuilder.group({
    contact: '',
    company_name: '',
    company_address: '',
    company_history: '',
    company_url: ''
  });


  onSubmit(): void {
    this.applicationService.submitApplication(this.applicationForm.value)
    console.log('Your order has been submitted', this.applicationForm.value.contact);
    this.applicationForm.reset();
  }



}
