package com.example.connectpitm.quickView

import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.connectpitm.R

class BCA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_bca)

        //        define WebView
        val webView: WebView = findViewById(R.id.webView1)
        webView.getSettings().setJavaScriptEnabled(true);

        val htmlContent = """
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>BBA (H) Course at PITM</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 0;
            background-color: #f4f4f4;
        }

        .container {
            width: 90%;
            max-width: 1200px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            border-radius: 8px;
        }

        h1, h2, h3, h4, h5 {
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: darkblue;
            margin-top: 20px;
        }

        h2 {
            color: darkgreen;
            margin-top: 10px;
            font-size: 24px;
        }

        h3 {
            color: #d74d52;
            margin-top: 10px;
            font-size: 20px;
        }

        h4, h5 {
            color: #333;
            margin: 5px 0;
        }

        p {
            text-align: justify;
            margin-bottom: 20px;
            font-size: 16px;
            color: #333;
        }

        img {
            width: 120px;
            height: 120px;
            border-radius: 50%;
            object-fit: cover;
            margin: 10px auto;
            display: block;
        }

        .divider {
            border-bottom: 1px solid #ccc;
            margin: 20px 0;
        }

        .fadeInUp {
            animation: fadeInUp 1s ease-out forwards;
        }

        @keyframes fadeInUp {
            from {
                opacity: 0;
                transform: translateY(20px);
            }
            to {
                opacity: 1;
                transform: translateY(0);
            }
        }

        .fee-container {
            display: flex;
            justify-content: space-around;
            align-items: center;
            flex-wrap: wrap;
            gap: 20px;
            margin: 0 auto;
            max-width: 1200px;
        }

        .fee-box {
            background-color: #3db166;
            color: white;
            text-align: center;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
        }

        .fee-box h3 {
            margin: 0;
            font-size: 18px;
            margin-bottom: 10px;
        }

        .fee-box p {
            margin: 0;
            font-size: 24px;
            font-weight: bold;
        }
        
         .fee-list {
            list-style: none;
            padding: 0;
            margin: 0;
        }
        
        .fee-item {
            display: flex;
            justify-content: space-between;
            padding: 10px 0;
            border-bottom: 1px solid #ccc;
        }

        .fee-item:last-child {
            border-bottom: none;
        }

        .fee-name {
            font-size: 16px;
            color: #333;
        }

        .fee-amount {
            font-size: 16px;
            color: red;
            font-weight: bold;
        }
    </style>
</head>`
<body>
    <div class="container">
        <!-- Title Section -->
        <h2>BCA (H) Course at PITM</h2>
        <p>
            In PITM, the under graduate courses are <b>affiliated to MAKAUT</b> began in the year , 2007. The departments have their own independent computer labs with high configuration machines , latest software which fulfill the industrial need of the students and Wi-Fi enabled environment.
        </p>

        <!-- HOD Section -->
        <div style="text-align: center;">
            <h4 style="font-size: 18px;">HOD: BCA</h4>
            <img 
                src="file:///android_asset/DD_BCA.jpg" 
                alt="Prof. Anuradha Chatterjee"/>
            <h5 style="font-size: 18px;">Prof. Dipanjan Kumar Dey</h5>
            <small style="font-size: 14px; color: #666;">HOD:BCA(B.Sc, M.Sc, M. Tech)</small>
        </div>

        <!-- Divider -->
        <div class="divider"></div>
        
        <!-- Teaching Pedagogy Section -->
        <p>
         <b>"Education is the most powerful weapon which you can use to change the world."</b>
        </p>
        <p>
            Greetings and a very warm welcome to PITM. Our significant journey in the field of education started in the year of 2007. Students have an opportunity to participate in various curricular, co-curricular, sports, cultural and social service.        </p>
        <p>
            At PITM, we ensure high quality education which motivate and empower our students to be lifelong learners and the productive members of the society.
        </p>
        <p>
            Best wishes!
        </p>
        
        <!-- Divider -->
        <div class="divider"></div>
        
        <!-- Fees Section -->
        <h3><u>Fees Structure</u></h3>
        <p>
            The parent organization "PRAJNANANANDA PATHAGRIHA" was founded with one of the primary motives of spreading education and skills among the masses. 
            PITM has a 'Student-first' approach. The fees have been kept at the lowest possible level to suit the requirements of the needy.
        </p>

        <div class="fee-container">
            <!-- Fee Box 1 -->
            <div class="fee-box">
                <h3>Fees Payable (per semester)</h3>
                <p>Rs. 20,000</p>
            </div>

            <!-- Fee Box 2 -->
            <div class="fee-box">
                <h3>Fees Payable (during admission)</h3>
                <p>Rs. 40,000</p>
            </div>

            <!-- Fee Box 3 -->
            <div class="fee-box">
                <h3>Total 4 Year Course Fees</h3>
                <p>Rs. 1,97,000</p>
            </div>
        </div>
        
        <!-- One-Time Fees -->
        <h3>One-Time Fees Payable (During Admission):</h3>
        <ul class="fee-list">
            <li class="fee-item">
                <span class="fee-name">Admission Fees</span>
                <span class="fee-amount">Rs. 15,000</span>
            </li>
            <li class="fee-item">
                <span class="fee-name">Caution Deposit (refundable)</span>
                <span class="fee-amount">Rs. 3,000</span>
            </li>
            <li class="fee-item">
                <span class="fee-name">Library & Lab Fees</span>
                <span class="fee-amount">Rs. 10,000</span>
            </li>
            <li class="fee-item">
                <span class="fee-name">Uniform Making Charges</span>
                <span class="fee-amount">Rs. 7,000</span>
            </li>
            <li class="fee-item">
                <span class="fee-name">Book Bank Fees</span>
                <span class="fee-amount">Rs. 5,000</span>
            </li>
        </ul>
        
        <ul>
    <li>
        Students will be provided with books every semester. After the completion of the semester, 
        the student shall return the books and take the next set of books for the subsequent semester.
    </li>
    <li>
        A refundable Caution Deposit of Rs. 3,000/- has to be submitted by the students at the time of Admission. 
        This will be refundable at the completion of the programme after adjusting for any damage of property/ fine/ penalties/ dues etc.
    </li>
    <li>
        Fees can be paid through Cheque, Demand Drafts, or Banker's Cheque in favour of 
        "Prajnanananda Institute of Technology & Management", payable at Kolkata. Fees may also be paid in cash.
    </li>
</ul>

        
    </div>
</body>
</html>
        """

// Enable JavaScript if necessary
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

// Load the HTML content into the WebView
        webView.loadDataWithBaseURL(null, htmlContent, "text/html", "UTF-8", null)



    }
}