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
            <h1>${product.name}</h1>

            <h2>${product.description}</h2>

            <h2>${product.price}</h2>
        </div>
    </section>

    <!-- Section 2 -->
    <section class="rightcontainer">
        <dt>Show</dt>
        <dd>
            <ul>
                <g:each in="${tags}" var="tag">
                <li>${tag.name}</li>
                </g:each>
            </ul>
        </dd>
    </dl>
    </section>
    <!-- Section 3 -->
    <section class="bottomcontainer">
        <g:render template="shoppingCart" collection="${suborders}" var="suborder"/>
        <div>
            <h4>Title</h4>

            <p>Description</p>

            <p>Price</p>
        </div>
    </section>
</section>

</body>
</html>