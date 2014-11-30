import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_pizzastore_authupdatePassword_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/auth/updatePassword.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
invokeTag('set','g',6,['var':("title"),'value':(message(code: 'updatePassword', default: 'Update Password'))],-1)
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
invokeTag('message','g',25,['code':("shiroUser.oldpassword.label"),'default':("Old Password")],-1)
printHtmlPart(11)
invokeTag('passwordField','g',27,['name':("oldpassword"),'required':("")],-1)
printHtmlPart(12)
invokeTag('message','g',31,['code':("shiroUser.password1.label"),'default':("New Password")],-1)
printHtmlPart(11)
invokeTag('passwordField','g',33,['name':("password1"),'required':("")],-1)
printHtmlPart(13)
invokeTag('message','g',37,['code':("shiroUser.password2.label"),'default':("Repeat Password")],-1)
printHtmlPart(11)
invokeTag('passwordField','g',39,['name':("password2"),'required':("")],-1)
printHtmlPart(14)
invokeTag('submitButton','g',43,['class':("save"),'name':("update"),'value':(message(code: 'default.update.label', default: 'Update'))],-1)
printHtmlPart(15)
})
invokeTag('form','g',45,['action':("doUpdatePassword")],2)
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',47,[:],1)
printHtmlPart(17)
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
