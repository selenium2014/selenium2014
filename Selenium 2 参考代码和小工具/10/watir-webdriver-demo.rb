require 'watir-webdriver'

browser = Watir::Browser.new :firefox
browser.goto "http://www.baidu.com/"

browser.text_field(:id => "kw").set("watir-webdriver demo")
browser.button(:id => "su").click

browser.close
