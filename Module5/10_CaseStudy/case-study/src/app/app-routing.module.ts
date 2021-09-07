import {NgModule} from '@angular/core';
import {RouterModule, Routes} from '@angular/router';
import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import {CommonModule} from "@angular/common";
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {NgxPaginationModule} from "ngx-pagination";
import { EmployeeCreateComponent } from './components/employee/employee-create/employee-create.component';
import {MaterialModule} from "./material.module";
import { EmployeeDeleteComponent } from './components/employee/employee-delete/employee-delete.component';
import {MatDialogModule} from "@angular/material/dialog";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-create', component: EmployeeCreateComponent},


  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes),
    ReactiveFormsModule,
    CommonModule,
    Ng2SearchPipeModule,
    FormsModule,
    NgxPaginationModule,
    MaterialModule, MatDialogModule],
  exports: [RouterModule],
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    EmployeeListComponent,
    EmployeeCreateComponent,
    EmployeeDeleteComponent
  ]
})
export class AppRoutingModule {
}
