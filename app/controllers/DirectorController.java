package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.index;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class DirectorController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result list(int page, String sortBy, String order, String filter) {
        return ok();
    }
    public Result save() {
        return ok();
    }
    public Result edit(Long id) {
        return ok();
    }
    public Result update(Long id) {
        return ok();
    }
    public Result delete(Long id) {
        return ok();
    }

}
