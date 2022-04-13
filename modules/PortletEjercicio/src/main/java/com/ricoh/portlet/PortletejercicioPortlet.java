package com.ricoh.portlet;

import com.ricoh.constants.PortletejercicioPortletKeys;
import com.ricoh.model.Registro;
import com.ricoh.service.RegistroLocalServiceUtil;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import com.liferay.captcha.util.CaptchaUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.captcha.CaptchaTextException;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.mail.internet.InternetAddress;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;
import com.liferay.mail.kernel.model.MailMessage;
import com.liferay.mail.kernel.service.MailServiceUtil;
import javax.mail.internet.InternetAddress;

import org.osgi.service.component.annotations.Component;

/**
 * @author Agustin Cicchitti
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Portletejercicio", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + PortletejercicioPortletKeys.PORTLETEJERCICIO,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)

public class PortletejercicioPortlet extends MVCPortlet {

	private Log log = LogFactoryUtil.getLog(this.getClass().getName());

	public void registroPersona(ActionRequest actionRequest, ActionResponse actionResponse)
			throws IOException, PortletException {

		DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String nombre = ParamUtil.getString(actionRequest, "nombre", "");
		String apellido = ParamUtil.getString(actionRequest, "apellido", "");
		Date nacimiento = ParamUtil.getDate(actionRequest, "nacimiento", formatter);
		Date fechacreacion = new Date();
		String correo = ParamUtil.getString(actionRequest, "correo", "");

		Registro reg = RegistroLocalServiceUtil
				.createRegistro(CounterLocalServiceUtil.increment(Registro.class.getName()));

		try {
			reg.setNombre(nombre);
			reg.setApellido(apellido);
			reg.setNacimiento(nacimiento);
			reg.setFechacreacion(fechacreacion);
			reg.setCorreo(correo);			
			CaptchaUtil.check(actionRequest);
			log.info("CAPTCHA verification successful.");
			sendEmail(correo);
			RegistroLocalServiceUtil.addRegistro(reg);
		} catch (Exception exception) {
			if (exception instanceof CaptchaTextException) {
				SessionErrors.add(actionRequest, exception.getClass(), exception);
				log.error("CAPTCHA verification failed.");
			}
		}

	}

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {

		String jspPage = ParamUtil.getString(renderRequest, "jspPage", "");
		if (jspPage.equals("/listado.jsp")) {
			List<Registro> registros = RegistroLocalServiceUtil.getRegistros(-1, -1);
			renderRequest.setAttribute("registros", registros);

		}
		// TODO Auto-generated method stub
		super.render(renderRequest, renderResponse);
	}

	@Override
	public void serveResource(ResourceRequest resourceRequest, ResourceResponse resourceResponse)
			throws IOException, PortletException {
		try {
			CaptchaUtil.serveImage(resourceRequest, resourceResponse);
		} catch (Exception exception) {
			log.error(exception.getMessage(), exception);
		}
	}

	protected boolean isCheckMethodOnProcessAction() {
		return _CHECK_METHOD_ON_PROCESS_ACTION;
	}

	private static final boolean _CHECK_METHOD_ON_PROCESS_ACTION = false;
	
	
	
	private void sendEmail(String mail) {
        try {
            MailMessage mailMessage = new MailMessage();
            mailMessage.setBody("Se ha creado su usuario");
            mailMessage.setHTMLFormat(true);
            mailMessage.setFrom(new InternetAddress("agucichii@gmail.com","Agustin Cicchitti"));
            mailMessage.setTo(new InternetAddress(mail));
            mailMessage.setSubject("Registro Usuario");
            MailServiceUtil.sendEmail(mailMessage);
            log.info("Mail Send Successfully.");
        } catch (Exception e) {
        	log.error("Mail Send Failed.");
            throw new RuntimeException(e);
        }
    }
		
}