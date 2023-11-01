import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ApplicationListComponent } from './application-list/application-list.component';
import { ApplicationDetailComponent } from './application-detail/application-detail.component';

@NgModule({
  declarations: [
    AppComponent,
    ApplicationListComponent,
    ApplicationDetailComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
