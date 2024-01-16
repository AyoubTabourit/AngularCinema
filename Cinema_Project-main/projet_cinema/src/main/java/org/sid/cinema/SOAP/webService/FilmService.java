package org.sid.cinema.SOAP.webService;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import org.sid.cinema.SOAP.models.Film;

import java.util.Date;
import java.util.List;
@WebService(name = "FilmWS")
public class FilmService {
@WebMethod(operationName = "getfilm")
    public Film getfilm(@WebParam(name = "Id") Integer id){
        return new Film(id,"title","description",new Date(),1.5,"photo");
    }
    @WebMethod(operationName = "filmList")
    public List<Film> filmList(){
        return List.of(
                new Film(1,"title","description",new Date(),1.5,"photo"),
                new Film(2,"title1","description",new Date(),1.5,"photo1"),
                new Film(3,"title2","description",new Date(),1.5,"photo2"),
                new Film(4,"title3","description",new Date(),1.5,"photo3")

        );
    }
}
