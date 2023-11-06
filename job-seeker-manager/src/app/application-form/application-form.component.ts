import { Component } from '@angular/core';
import { FormBuilder } from '@angular/forms';

@Component({
  selector: 'app-application-form',
  templateUrl: './application-form.component.html',
  styleUrls: ['./application-form.component.css']
})
export class ApplicationFormComponent {

  constructor(private formBuilder: FormBuilder) {

  }

  applicationForm = this.formBuilder.group({
    name: '',
    address: ''
  });

  onSubmit(): void {
    // Process checkout data here
    // this.items = this.cartService.clearCart();
    console.warn('Your order has been submitted', this.applicationForm.value);
    // this.checkoutForm.reset();
  }



}
