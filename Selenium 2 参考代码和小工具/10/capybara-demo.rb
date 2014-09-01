require "capybara/dsl"

Capybara.app_host = 'http://www.google.com'
Capybara.default_wait_time = 15

Capybara.current_driver = :selenium

include Capybara::DSL

visit "/"

fill_in "q", :with => "Capybara"
find("#gbqfbw button").click

page.should have_content 'Capybara'
