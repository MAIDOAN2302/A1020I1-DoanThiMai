import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";
import {IEducationDegree} from "../models/educationDegree";

@Injectable({
  providedIn: 'root'
})
export class EducationDegreeService {
  public API: string = ' http://localhost:3000/educationDegree';


  constructor(private http: HttpClient) {
  }

  getAllEducationDegree(): Observable<IEducationDegree[]> {
    return this.http.get<IEducationDegree[]>(this.API)
  }
}
