Proxy pattern adds additional behaviour with the intent of controlling access to the underlying object.<br/>
<ul>
<li>Remote proxy: in this case the proxy will be in charge of all the details involved in creating a connection and accessing a remote resource instead of scattering these logic all over your code.</li>
<li>Virtual proxy: in a situation where the underlying resource is expensive to create or instantiate, a virtual proxy ensures that the instantiation of the object is only done once (or only when necessary), thereby saving processing power. The example illustrated here is a virtual proxy</li>
<li>Protection proxy: used to restrict access to a method call only to clients who have the right to make that call. eg. Spring security, Spring AOP, Spring @Transactional use the proxy pattern</li>
</ul>