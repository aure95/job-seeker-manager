import { Component } from '@angular/core';
import { Application } from '../application';
import { Website } from '../website';
import { ApplicationStatus } from '../application-status';
import { Company } from '../company';




@Component({
  selector: 'app-application-list',
  templateUrl: './application-list.component.html',
  styleUrls: ['./application-list.component.css']
})
export class ApplicationListComponent {

  applications: Application[] = [{
    id: 1,
    application_date: new Date(),
    company: {
      id: 1,
      name: 'company_name',
      address: 'company_adress',
      history: 'company_history',
      url: 'company_url'
    } as Company,
    provider_site: {
      id: 1,
      name: 'provider_name',
      url: 'provider_url'
    } as Website,
    contact: 'contact_test',
    phone_number: '01 02 03 04 05',
    motivation_letter_location: 'motivation_letter_location_test',
    start_date: new Date(),
    end_date: new Date(),
    relaunch_date: new Date(),
    status: ApplicationStatus.COMPLETE

  }]

}
