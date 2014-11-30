<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Pizza Store</title>
    <blueprint:resources/>
    <link href="${resource(dir: 'css', file: 'app.css')}" type="text/css" rel="stylesheet">
</head>

<body>
<section class="container">
    <!-- Section 1 -->
    <section class="leftcontainer">
    <g:render template="productCard" collection="${products}" var="product"/>
        <div>
            <h4>Title</h4>

            <p>Description</p>

            <p>Price</p>
        </div>
    </section>

    <!-- Section 2 -->
    <section class="rightcontainer">
        <dt>Show</dt>
        <dd>
            <ul>
                <g:each in="${tags}" var="tag">
                <li>${tag.name}</li>
                <li>Dinner</li>
                </g:each>
            </ul>
        </dd>
    </dl>
    </section>
</section>

</body>
</html>