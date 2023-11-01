import { Company } from "./website";

export interface Interview {

  id: number,
  company: Company,
  adress: string
  phone_number: string
  contact: string
  date: Date
}
