package controllers;

import java.util.List;

import org.codehaus.jackson.node.ObjectNode;

import models.Game;
import models.User;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.labora;

public class LaboraGame extends Controller {

	public static Result index() {
		List<Game> games = new Model.Finder(Long.class, Game.class).all();
		return ok(Json.toJson(games));
	}

	public static Result select(Long gameId) {
		ObjectNode result = Json.newObject();
		result.put("gameId", gameId);
		result.put("status", "OK");
		return ok(result);
	}
	
	public static Result create() {
		Game game = new Game();
		game.save();
		return ok(Json.toJson(game));
	}
	
	public static Result update(Long gameId) {
		return TODO;
	}
	
	public static Result delete(Long gameId) {
		return TODO;
	}
}
