import { Injectable } from '@angular/core';
import { Application } from './application';

@Injectable({
  providedIn: 'root'
})
export class ApplicationService {

  constructor() { }

  submitApplication(application: any) {
    let application_generated = {} as Application
    console.log(`Homes application received`);
  }
}
