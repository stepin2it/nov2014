import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzastore_authlostPassword_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/auth/lostPassword.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("title"),'value':(message(code: 'lostPassword', default: 'Lost Password'))],-1)
printHtmlPart(1)
createTagBody(2, {->
createTagBody(3, {->
expressionOut.print(title)
})
invokeTag('captureTitle','sitemesh',7,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',7,[:],2)
printHtmlPart(2)
})
invokeTag('captureHead','sitemesh',8,[:],1)
printHtmlPart(2)
createTagBody(1, {->
printHtmlPart(3)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.home.label")],-1)
printHtmlPart(5)
expressionOut.print(title)
printHtmlPart(6)
if(true && (flash.message)) {
printHtmlPart(7)
expressionOut.print(flash.message)
printHtmlPart(8)
}
printHtmlPart(9)
createTagBody(2, {->
printHtmlPart(10)
invokeTag('message','g',24,['code':("shiroUser.username.label"),'default':("Username")],-1)
printHtmlPart(11)
invokeTag('textField','g',26,['name':("username")],-1)
printHtmlPart(12)
invokeTag('message','g',31,['code':("shiroUser.email.label"),'default':("Email")],-1)
printHtmlPart(11)
invokeTag('textField','g',33,['name':("email")],-1)
printHtmlPart(13)
invokeTag('submitButton','g',37,['class':("save"),'name':("sendRequest"),'value':(message(code: 'password.reset.send.label', default: 'Send Request'))],-1)
printHtmlPart(14)
})
invokeTag('form','g',40,['action':("sendPasswordResetRequest")],2)
printHtmlPart(15)
})
invokeTag('captureBody','sitemesh',42,[:],1)
printHtmlPart(16)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1416810720000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
