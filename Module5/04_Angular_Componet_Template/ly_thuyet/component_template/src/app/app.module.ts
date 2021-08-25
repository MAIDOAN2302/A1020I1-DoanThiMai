import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ListStudentComponent } from './list-student/list-student.component';
import {FormsModule} from "@angular/forms";
import { StudentListComponent } from './student-list/student-list.component';

@NgModule({
  declarations: [
    AppComponent,
    ListStudentComponent,
    StudentListComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule
    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
