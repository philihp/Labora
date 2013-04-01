package models;

import be.objectify.deadbolt.core.models.Permission;
import be.objectify.deadbolt.core.models.Role;
import be.objectify.deadbolt.core.models.Subject;
import com.avaje.ebean.Ebean;
import com.avaje.ebean.ExpressionList;
import com.avaje.ebean.validation.Email;
import com.feth.play.module.pa.providers.password.UsernamePasswordAuthUser;
import com.feth.play.module.pa.user.AuthUser;
import com.feth.play.module.pa.user.AuthUserIdentity;
import com.feth.play.module.pa.user.EmailIdentity;
import com.feth.play.module.pa.user.NameIdentity;
import com.feth.play.module.pa.user.FirstLastNameIdentity;
import models.TokenAction.Type;
import play.data.format.Formats;
import play.db.ebean.Model;

import javax.persistence.*;
import java.util.*;

@Entity
public class Game extends Model {
	
	public static enum Length {
		SHORT, LONG
	}
	
	public static enum Country {
		FRANCE, IRELAND
	}
	
	public static enum Players {
		ONE, TWO, THREE, FOUR
	}
	

	@Id
	public Long id;

	@Enumerated(EnumType.STRING)
	public Game.Length length;
	
	@Enumerated(EnumType.STRING)
	public Game.Country country;
	
	@Enumerated(EnumType.STRING)
	public Game.Players players; 
}
