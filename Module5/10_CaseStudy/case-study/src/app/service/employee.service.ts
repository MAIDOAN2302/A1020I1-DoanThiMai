import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {IEmployee} from "../models/employee";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API: string = 'http://localhost:3000/employee';

  constructor(
    private http: HttpClient
  ) { }
  getAllEmployees(): Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(this.API);
  }

  addNewEmployee(employee:IEmployee): Observable<any>{
    return this.http.post(this.API,employee);
  }

  getEmployeeById(idEmployee:string):Observable<IEmployee[]>{
    return this.http.get<IEmployee[]>(this.API + '/' + idEmployee);
  }

  deleteEmployeeByID(idEmployee:string): Observable<any>{
    return this.http.delete(this.API + '/' + idEmployee);
  }

  editEmployee(employee:IEmployee,idEmployee:string): Observable<any>{
  return this.http.put(this.API + '/' + idEmployee, employee);
  }

  search(nameSearch:string){
    console.log(nameSearch);
    return this.http.get(this.API + '?fullName_like=' + nameSearch);
  }
}
