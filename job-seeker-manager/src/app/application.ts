import { ApplicationStatus } from "./application-status"
import { Company } from "./company"
import { Website } from "./website"

export interface Application {

  id: number,
  company_url: string,
  provider_site: Website,
  company: Company,
  application_date: Date
  phone_number: string,
  contact: string
  motivation_letter_location: string,
  start_date: Date,
  relaunch_date: Date,
  end_date: Date,
  status: ApplicationStatus,

}
