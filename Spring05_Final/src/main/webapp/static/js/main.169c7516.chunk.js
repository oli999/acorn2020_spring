(this.webpackJsonpbasic=this.webpackJsonpbasic||[]).push([[0],{14:function(e,t,n){},27:function(e,t,n){"use strict";n.r(t);var a=n(0),o=n.n(a),c=n(7),l=n.n(c),r=(n(14),n(1)),i=n(2),s=n(8),u=n(4),d=n.n(u),h=function(){var e=Object(a.useState)({id:"",pwd:"",loginId:null}),t=Object(s.a)(e,2),n=t[0],c=t[1],l=function(e){var t=e.target.name,a=e.target.value;c(Object(i.a)({},n,Object(r.a)({},t,a)))};return o.a.createElement("div",null,n.loginId&&o.a.createElement("p",null,o.a.createElement("strong",null,n.loginId),"\ub2d8 \ub85c\uadf8\uc778\uc911..."),o.a.createElement("h1",null,"\ub85c\uadf8\uc778 \ud3fc \uc785\ub2c8\ub2e4."),o.a.createElement("form",{onSubmit:function(e){e.preventDefault(),fetch("http://localhost:8888/spring05/users/ajax_login.do",{method:"POST",headers:{"Content-Type":"application/x-www-form-urlencoded"},body:d.a.stringify(n)}).then((function(e){return e.json()})).then((function(e){console.log(e),e.isSuccess?c(Object(i.a)({},n,{loginId:e.id})):alert("\uc544\uc774\ub514 \ud639\uc740 \ube44\ubc00\ubc88\ud638\uac00 \ud2c0\ub824\uc694!")})).catch((function(e){console.log(e)}))}},o.a.createElement("input",{onChange:l,name:"id",type:"text",placeholder:"\uc544\uc774\ub514..."}),o.a.createElement("input",{onChange:l,name:"pwd",type:"password",placeholder:"\ube44\ubc00\ubc88\ud638..."}),o.a.createElement("button",{type:"submit"},"\ub85c\uadf8\uc778")),o.a.createElement("p",null,JSON.stringify(n)),o.a.createElement("p",null,d.a.stringify(n)),o.a.createElement("button",{onClick:function(){fetch("http://localhost:8888/spring05/users/ajax_logout.do").then((function(e){return e.json()})).then((function(e){e.isSuccess&&(c(Object(i.a)({},n,{loginId:null})),alert("\ub85c\uadf8 \uc544\uc6c3 \ub418\uc5c8\uc2b5\ub2c8\ub2e4."))}))}},"\ub85c\uadf8\uc544\uc6c3"))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));l.a.render(o.a.createElement(o.a.StrictMode,null,o.a.createElement(h,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))},9:function(e,t,n){e.exports=n(27)}},[[9,1,2]]]);
//# sourceMappingURL=main.169c7516.chunk.js.map