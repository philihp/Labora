package controllers;

import org.codehaus.jackson.node.ObjectNode;

import models.User;
import be.objectify.deadbolt.java.actions.Group;
import be.objectify.deadbolt.java.actions.Restrict;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.labora;

public class Labora extends Controller {

	public static Result index() {
		return ok(labora.render(Application.getLocalUser(session())));
	}
	
}
