set SCRIPT_DIR=%~dp0
java -Xmx1024M -XX:+CMSClassUnloadingEnabled -XX:MaxPermSize=1024m -jar "%SCRIPT_DIR%sbt-launch.jar" %*
