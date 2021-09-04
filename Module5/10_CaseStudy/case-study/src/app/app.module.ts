import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import {CustomerModule} from "./customer/customer.module";
import {RouterModule} from "@angular/router";
import { HomPageComponent } from './hom-page/hom-page.component';

@NgModule({
  declarations: [
    AppComponent,
    HomPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    CustomerModule,
    RouterModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
