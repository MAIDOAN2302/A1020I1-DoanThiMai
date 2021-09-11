import {ICustomerType} from "./customerType";

export interface ICustomer {
  id:number
  idCustomer:string;
  fullName: string;
  dateOfBirth:string;
  idCard:string;
  email:string;
  phone:string;
  address:string;
  customerType:ICustomerType;
  }
