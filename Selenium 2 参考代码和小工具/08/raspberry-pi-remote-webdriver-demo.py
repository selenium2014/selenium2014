import time

from selenium import webdriver
from selenium.webdriver.common.desired_capabilities import DesiredCapabilities

class RaspberryPiDemo():
    def __init__(self):
        print "Demo: Remote Selenium WebDriver with Firefox on Paspberry Pi "
        self.demo_impl = RaspberryPi_impl()

        print
        print "Set up selenium (this will take a while, be patient) ..."
        self.setUp()

        print
        print "Run cases ..."
        self.doClick()

        print
        print "Shutting down..."
        self.tearDown()

    def setUp(self):
        self.demo_impl.setUp()

    def doClick(self):
        self.demo_impl.doClick()

    def tearDown(self):
        self.demo_impl.tearDown()

class RaspberryPi_impl():

    def setUp(self):
        self.driver = webdriver.Remote(command_executor='http://192.168.0.107:4443/wd/hub',
                                       desired_capabilities=DesiredCapabilities.FIREFOX)
        self.driver.implicitly_wait(15)
        self.base_url = "http://www.baidu.com"

    def doClick(self):
        self.count = 0
        while self.count < 10:
            self.driver.get(self.base_url + "/")
            self.driver.find_element_by_id("kw").send_keys("selenium" + str(self.count))
            self.driver.find_element_by_id("su").click()
            print self.driver.title

            self.driver.back()
            time.sleep(1)
            self.count += 1

    def tearDown(self):
        self.driver.quit()

if __name__ == "__main__":
    RaspberryPiDemo()