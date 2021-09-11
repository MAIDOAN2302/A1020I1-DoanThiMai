import {IPosition} from "./position";
import {IEducationDegree} from "./educationDegree";
import {IPart} from "./part";

export interface IEmployee {
  idEmployee: string;
  fullName: string;
  position: IPosition;
  educationDegree: IEducationDegree;
  part: IPart;
  dateOfBirth: string;
  idCard: string;
  salary: string;
  email: string;
  phone: string;
  address: string;
}
