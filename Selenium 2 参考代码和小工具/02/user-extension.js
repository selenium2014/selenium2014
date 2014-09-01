var manager = new RollupManager();
 
manager.addRollupRule({
 name: 'logincommands'
 , description: 'log in to 126.com'
 , args: [
 ], commandMatchers: [
 ]
 , getExpandedCommands: function(args) {
 var commands = [];
 
 commands.push({
 command: 'open'
 , target: 'http://www.126.com/' //126邮箱地址的URL
 });

 commands.push({
 command: 'type'
 , target: 'id=idInput' //用户名输入框的id
 , value: 'seleniumiderollup'
 });

 commands.push({
 command: 'type'
 , target: 'id=pwdInput' //密码输入框的id
 , value: 'rollup123'
 });

 commands.push({
 command: 'clickAndWait'
 , target: 'id=loginBtn' //登陆按钮的id
 });
 
 return commands;
 }
});