package tk.jviewer.info.controller;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

/**
 * Controller for redirects.
 */
public class RedirectController {

    private static final String MAIN_CONTEXT_ROOT = "/main";

    /**
     * Do redirect to the main application.
     * @throws java.io.IOException if something gone wrong.
     */
    public void redirectToMain() throws IOException {
        ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
        externalContext.redirect(MAIN_CONTEXT_ROOT);
    }
}
