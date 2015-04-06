<html>
    <head>
    </head>
    <body>
        <f:view>
            <h:form id="mainForm">
                <h:outputLabel for="login" value="Enter Name : "/>
                <h:outputLabel for="Senha" value="Enter Password : "/>
                <h:inputText id="enterName" value="#{Usuario.nome}"/>
                <h:inputText id="enterPass" value="#{Usuario.senha}"/>
                <h:commandButton value="login" action="#{login.logar}"/>
            </h:form>
        </f:view>
    </body>
</html>
