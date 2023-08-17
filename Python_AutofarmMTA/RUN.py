import pyautogui
import time
from PIL import Image

def wait_and_press(key_to_press, wait_time=1):
    time.sleep(wait_time)
    pyautogui.press(key_to_press)

def check_and_press(image_path, key_to_press, threshold=0.99):
    screenshot = pyautogui.screenshot()
    template = Image.open(image_path)

    result = pyautogui.locate(template, screenshot, confidence=threshold)
    if result:
        x, y, width, height = result
        click_x = x + width // 2
        click_y = y + height // 2
        pyautogui.click(click_x, click_y)
        pyautogui.press(key_to_press)
    else:
        print("NOT MATCH, RUN AGAIN...")

# รอเวลาเพื่อให้คุณเตรียมหน้าต่างที่คุณต้องการตรวจสอบ
print("OPEN MTA MAHACHON CITY 5SEC...")
time.sleep(5)

# เงื่อนไขสำหรับยกเลิกการทำงาน
cancel_key = 'x'

# ทำงานแบบวนลูปจนกว่าจะถูกยกเลิก
while True:
    if pyautogui.press(cancel_key):
        print("CANCEL WORKING...")
        break
    
    check_and_press('C:\SE65\PYTHON_AUTOFARM_MTA\AUTOFARM_ICECREAM\Images\imageE.png', 'e')
    wait_and_press('enter')

    check_and_press('C:\SE65\PYTHON_AUTOFARM_MTA\AUTOFARM_ICECREAM\Images\imageS.png', 's')
    wait_and_press('enter')

    check_and_press('C:\SE65\PYTHON_AUTOFARM_MTA\AUTOFARM_ICECREAM\Images\imageD.png', 'd')
    wait_and_press('enter')

    check_and_press('C:\SE65\PYTHON_AUTOFARM_MTA\AUTOFARM_ICECREAM\Images\imageQ.png', 'q')
    wait_and_press('enter')

    check_and_press('C:\SE65\PYTHON_AUTOFARM_MTA\AUTOFARM_ICECREAM\Images\imageW.png', 'w')
    wait_and_press('enter')

    check_and_press('C:\SE65\PYTHON_AUTOFARM_MTA\AUTOFARM_ICECREAM\Images\imageA.png', 'a')
    wait_and_press('enter')


    
