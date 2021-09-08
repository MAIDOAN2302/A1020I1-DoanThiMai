import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ServicesService {

  public API: string = ' http://localhost:3000/services';

  constructor(
    private http: HttpClient
  ) { }
  getAllServices(): Observable<any>{
    return this.http.get(this.API);
  }

  // @ts-ignore
  addNewServices(services): Observable<any>{
    return this.http.post(this.API,services);
  }

  // @ts-ignore
  getServicesById(servicesID):Observable<any>{
    return this.http.get(this.API + '/' + servicesID);
  }

  // @ts-ignore
  deleteServicesByID(servicesID): Observable<any>{
    return this.http.delete(this.API + '/' + servicesID);
  }

  // @ts-ignore
  editServices(services,servicesID): Observable<any>{
    return this.http.put(this.API + '/' + servicesID, services);
  }
}
