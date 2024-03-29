import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
@Injectable({
  providedIn: 'root'
})


export class CinemaService {

  public host:string="http://localhost:8083"
  constructor(private http:HttpClient) { }
  public getVilles(){
    return this.http.get(this.host+"/villes")
  }

  getCinemas(v: any) {
    return this.http.get(v._links.cinemas.href);
  }

  getSalles(c: any) {
    return this.http.get(c._links.salles.href);
  }

  getProjection(salle: any) {
    let url = salle._links.projections.href.replace("{?projection}","");
    return this.http.get(url+"?projection=p1");
  }

  getPlace(p: any) {
    let url = p._links.tickets.href.replace("{?projection}","");
    return this.http.get(url+"?projection=ticketsProj");
  }

  payerTickets(dataForm:any) {
    return this.http.post(this.host+"/payerTickets",dataForm);
  }

  /*payerTickets(Tickets: TicketsDetails):Observable<any>{
    const base=this.http.post(this.host+"/payerTickets",Tickets)

    const request =base.pipe(
      map((data:TicketsDetails)=>{
        return data
      })
    )
    return request
  }*/
}
