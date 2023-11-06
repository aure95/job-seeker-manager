import { Component, Input, NgModule } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { Application } from '../application';

@Component({
  selector: 'app-application-detail',
  templateUrl: './application-detail.component.html',
  styleUrls: ['./application-detail.component.css'],
})

export class ApplicationDetailComponent {

  @Input() application!: Application;
}
