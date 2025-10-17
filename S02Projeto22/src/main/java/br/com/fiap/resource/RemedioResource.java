package br.com.fiap.resource;

import br.com.fiap.bo.RemedioBO;
import br.com.fiap.to.RemedioTO;
import jakarta.validation.Valid;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.ArrayList;
import java.util.ResourceBundle;

// Path: Define o caminho base para todos os métodos dentro da classe RemedioResource
@Path("/megafarma")
public class RemedioResource {
    private RemedioBO remedioBO = new RemedioBO();

    // GET: é o verbo HTTP que papeia o método findAll
    @GET
    // Produces: Define o tipo de informação que o método irá produzir/retornar
    // MediaType.APPLICATION_JSON: Constante que representa o formato JSON.
    // O que aconteceria se eu tirasse o @Produces(MediaType.APPLICATION_JSON)? Continua a mesma coisa.
//    @Produces(MediaType.APPLICATION_JSON)
    public Response findAll() {
        ArrayList<RemedioTO> resultado = remedioBO.findAll();
        // response: Ajuda a criar a resposta HTTP
        // Por que response inicia null? Por que não deixar sem atribuir
        Response.ResponseBuilder response;

        if (resultado != null) {
            response = Response.ok();           // 200 (OK)
        } else {
            response = Response.status(404);    // 404 (NOT FOUND)
        }

        // Forma o Body/entity da resposta HTTP
        response.entity(resultado);
        return response.build();
    }

    @GET
    @Path("/{codigo}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findByCodigo(@PathParam("codigo") Long codigo) {
        RemedioTO resultado = remedioBO.findByCodigo(codigo);
        Response.ResponseBuilder response;

        if (resultado != null) {
            response = Response.ok();
        } else {
            response = Response.status(404);
        }

        response.entity(resultado);
        return response.build();
    }

    // Mapeia o método save para requisições do tipo POST
    @POST
    // Consumes: Define o formato que receberá as informações do cliente
    // O que é o MediaType.APPLICATION_JSON nesse caso?
    @Consumes(MediaType.APPLICATION_JSON)
    // @Valid: Testa as validações criadas no RemedioTO
    public Response save(@Valid RemedioTO remedio) {
        RemedioTO resultado = remedioBO.save(remedio);
        Response.ResponseBuilder response;

        // O que está acontecendo aqui?
        if (resultado != null) {
            // Por que retorna nulo?
            response = Response.created(null);
        } else {
            response = Response.status(400);
        }

        // O que é o response? O que o método entity faz?
        response.entity(resultado);

        // O que o método build faz?
        return response.build();
    }

    @DELETE
    @Path("/{codigo}")
    public Response delete(@PathParam("codigo") Long codigo) {
        Response.ResponseBuilder response;

        if (remedioBO.delete(codigo)) {
            response = Response.status(204);
        } else {
            response = Response.status(404);
        }

        return response.build();
    }

    @PUT
    @Path("/{codigo}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@Valid RemedioTO remedio, @PathParam("codigo") Long codigo) {
        remedio.setCodigo(codigo);
        RemedioTO resultado = remedioBO.update(remedio);
        Response.ResponseBuilder response;

        if (resultado != null) {
            response = Response.created(null);
        } else {
            response = Response.status(400);
        }

        response.entity(resultado);
        return response.build();
    }
}


