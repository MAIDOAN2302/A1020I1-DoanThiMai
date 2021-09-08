import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API: string = ' http://localhost:3000/customer';

  constructor(
    private http: HttpClient
  ) { }
  getAllCustomers(): Observable<any>{
    return this.http.get(this.API);
  }

  // @ts-ignore
  addNewCustomer(customer): Observable<any>{
    return this.http.post(this.API,customer);
  }

  // @ts-ignore
  getCustomerById(customerID):Observable<any>{
    return this.http.get(this.API + '/' + customerID);
  }

  // @ts-ignore
  deleteCustomerByID(customerID): Observable<any>{
    return this.http.delete(this.API + '/' + customerID);
  }

  // @ts-ignore
  editCustomer(customer,customerID): Observable<any>{
    return this.http.put(this.API + '/' + customerID, customer);
  }
}
