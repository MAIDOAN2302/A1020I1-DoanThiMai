import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {
  public API: string = ' http://localhost:3000/employee';

  constructor(
    private http: HttpClient
  ) { }
  getAllEmployees(): Observable<any>{
    return this.http.get(this.API);
  }

  // @ts-ignore
  addNewEmployee(employee): Observable<any>{
    return this.http.post(this.API,employee);
  }

  // @ts-ignore
  getEmployeeById(employeeID):Observable<any>{
    return this.http.get(this.API + '/' + employeeID);
  }

  // @ts-ignore
  deleteEmployeeByID(employeeID): Observable<any>{
    return this.http.delete(this.API + '/' + employeeID);
  }

  // @ts-ignore
  editEmployee(employee,employeeID): Observable<any>{
  return this.http.put(this.API + '/' + employeeID, employee);
  }
}
