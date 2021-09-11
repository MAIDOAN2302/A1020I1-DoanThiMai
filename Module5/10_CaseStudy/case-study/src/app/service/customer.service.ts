import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {ICustomer} from "../models/customer";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API: string = ' http://localhost:3000/customer';

  constructor(
    private http: HttpClient
  ) { }
  getAllCustomers(): Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this.API);
  }

  addNewCustomer(customer:ICustomer): Observable<any>{
    return this.http.post(this.API,customer);
  }

  getCustomerById(idCustomer:string):Observable<ICustomer[]>{
    return this.http.get<ICustomer[]>(this.API + '/' + idCustomer);
  }

  deleteCustomerByID(idCustomer:string): Observable<any>{
    return this.http.delete(this.API + '/' + idCustomer);
  }

  editCustomer(customer:ICustomer,idCustomer:string): Observable<any>{
    return this.http.put(this.API + '/' + idCustomer, customer);
  }

  search(nameSearch:string){
    console.log(nameSearch);
    return this.http.get(this.API + '?fullName_like=' + nameSearch);
  }
}
