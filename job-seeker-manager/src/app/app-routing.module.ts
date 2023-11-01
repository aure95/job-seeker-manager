import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ApplicationListComponent } from './application-list/application-list.component';
import { ApplicationDetailComponent } from './application-detail/application-detail.component';

const routes: Routes = [
    {path: '', component: ApplicationListComponent},
    {path: 'applications', component: ApplicationListComponent},
    {path: 'applications/:id', component: ApplicationDetailComponent}];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
