import { Component, Input } from '@angular/core';
import { Application } from '../application';

@Component({
  selector: 'app-application-detail',
  templateUrl: './application-detail.component.html',
  styleUrls: ['./application-detail.component.css']
})
export class ApplicationDetailComponent {

  @Input() application!: Application;
}
