/*
 * Copyright (C) 2013 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothlegatt;

import java.util.HashMap;

/**
 * This class includes a small subset of standard GATT attributes for demonstration purposes.
 */
public class SampleGattAttributes
{
    private static HashMap<String, String> attributes = new HashMap();
    public static String HEART_RATE_MEASUREMENT = "00002a37-0000-1000-8000-00805f9b34fb";
    public static String CLIENT_CHARACTERISTIC_CONFIG = "00002902-0000-1000-8000-00805f9b34fb";
    public static String STEP_COUNTING = "0000fea1-0000-1000-8000-00805f9b34fb";
    public static String HEART_BEAT_MEASUREMENT = "6e400003-b5a3-f393-e0a9-e50e24dcca9e";
    public static String MAC_ADDRESS_INFO = "0000fec9-0000-1000-8000-00805f9b34fb";
    public static String CENTRAL_ADDRESS_RESOLUTION = "00002aa6-0000-1000-8000-00805f9b34fb";

    static
    {
        // Sample Services.
        attributes.put("0000180d-0000-1000-8000-00805f9b34fb", "Heart Rate Service");
        attributes.put("0000180a-0000-1000-8000-00805f9b34fb", "Device Information Service");
        // Sample Characteristics.
        attributes.put(HEART_RATE_MEASUREMENT, "Heart Rate Measurement");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");

        // Servicos da pulseira F1.
        attributes.put("6e400001-b5a3-f393-e0a9-e50e24dcca9e", "F1 Heart Rate Service");
        attributes.put("0000fee7-0000-1000-8000-00805f9b34fb", "F1 Step Service");
        attributes.put(STEP_COUNTING, "F1 Number of Steps");
        attributes.put(HEART_BEAT_MEASUREMENT, "F1 Heart Beat Number");
        attributes.put(MAC_ADDRESS_INFO, "Mac address");
        attributes.put(CENTRAL_ADDRESS_RESOLUTION, "Central Address Resolution");


        // extra characteristics
        attributes.put("00002a7E-0000-1000-8000-00805f9b34fb", "Aerobic Heart Rate Lower Limit");
        attributes.put("00002a84-0000-1000-8000-00805f9b34fb", "Aerobic Heart Rate Upper Limit");
        attributes.put("00002a7F-0000-1000-8000-00805f9b34fb", "Aerobic Threshold");
        attributes.put("00002a80-0000-1000-8000-00805f9b34fb", "Age");
        attributes.put("00002a5A-0000-1000-8000-00805f9b34fb", "Aggregate");
        attributes.put("00002a43-0000-1000-8000-00805f9b34fb", "Alert Category ID");
        attributes.put("00002a42-0000-1000-8000-00805f9b34fb", "Alert Category ID Bit Mask");
        attributes.put("00002a06-0000-1000-8000-00805f9b34fb", "Alert Level");
        attributes.put("00002a44-0000-1000-8000-00805f9b34fb", "Alert Notification Control Point");
        attributes.put("00002a3F-0000-1000-8000-00805f9b34fb", "Alert Status");
        attributes.put("00002aB3-0000-1000-8000-00805f9b34fb", "Altitude");
        attributes.put("00002a81-0000-1000-8000-00805f9b34fb", "Anaerobic Heart Rate Lower Limit");
        attributes.put("00002a82-0000-1000-8000-00805f9b34fb", "Anaerobic Heart Rate Upper Limit");
        attributes.put("00002a83-0000-1000-8000-00805f9b34fb", "Anaerobic Threshold");
        attributes.put("00002a58-0000-1000-8000-00805f9b34fb", "Analog");
        attributes.put("00002a73-0000-1000-8000-00805f9b34fb", "Apparent Wind Direction");
        attributes.put("00002a72-0000-1000-8000-00805f9b34fb", "Apparent Wind Speed");
        attributes.put("00002a01-0000-1000-8000-00805f9b34fb", "Appearance");
        attributes.put("00002aA3-0000-1000-8000-00805f9b34fb", "Barometric Pressure Trend");
        attributes.put("00002a19-0000-1000-8000-00805f9b34fb", "Battery Level");
        attributes.put("00002a49-0000-1000-8000-00805f9b34fb", "Blood Pressure Feature");
        attributes.put("00002a35-0000-1000-8000-00805f9b34fb", "Blood Pressure Measurement");
        attributes.put("00002a9B-0000-1000-8000-00805f9b34fb", "Body Composition Feature");
        attributes.put("00002a9C-0000-1000-8000-00805f9b34fb", "Body Composition Measurement");
        attributes.put("00002a38-0000-1000-8000-00805f9b34fb", "Body Sensor Location");
        attributes.put("00002aA4-0000-1000-8000-00805f9b34fb", "Bond Management Control Point");
        attributes.put("00002aA5-0000-1000-8000-00805f9b34fb", "Bond Management Feature");
        attributes.put("00002a22-0000-1000-8000-00805f9b34fb", "Boot Keyboard Input Report");
        attributes.put("00002a32-0000-1000-8000-00805f9b34fb", "Boot Keyboard Output Report");
        attributes.put("00002a33-0000-1000-8000-00805f9b34fb", "Boot Mouse Input Report");
        attributes.put("00002aA6-0000-1000-8000-00805f9b34fb", "Central Address Resolution");
        attributes.put("00002aA8-0000-1000-8000-00805f9b34fb", "CGM Feature");
        attributes.put("00002aA7-0000-1000-8000-00805f9b34fb", "CGM Measurement");
        attributes.put("00002aAB-0000-1000-8000-00805f9b34fb", "CGM Session Run Time");
        attributes.put("00002aAA-0000-1000-8000-00805f9b34fb", "CGM Session Start Time");
        attributes.put("00002aAC-0000-1000-8000-00805f9b34fb", "CGM Specific Ops Control Point");
        attributes.put("00002aA9-0000-1000-8000-00805f9b34fb", "CGM Status");
        attributes.put("00002a5C-0000-1000-8000-00805f9b34fb", "CSC Feature");
        attributes.put("00002a5B-0000-1000-8000-00805f9b34fb", "CSC Measurement");
        attributes.put("00002a2B-0000-1000-8000-00805f9b34fb", "Current Time");
        attributes.put("00002a66-0000-1000-8000-00805f9b34fb", "Cycling Power Control Point");
        attributes.put("00002a65-0000-1000-8000-00805f9b34fb", "Cycling Power Feature");
        attributes.put("00002a63-0000-1000-8000-00805f9b34fb", "Cycling Power Measurement");
        attributes.put("00002a64-0000-1000-8000-00805f9b34fb", "Cycling Power Vector");
        attributes.put("00002a99-0000-1000-8000-00805f9b34fb", "Database Change Increment");
        attributes.put("00002a85-0000-1000-8000-00805f9b34fb", "Date of Birth");
        attributes.put("00002a86-0000-1000-8000-00805f9b34fb", "Date of Threshold Assessment");
        attributes.put("00002a08-0000-1000-8000-00805f9b34fb", "Date Time");
        attributes.put("00002a0A-0000-1000-8000-00805f9b34fb", "Day Date Time");
        attributes.put("00002a09-0000-1000-8000-00805f9b34fb", "Day of Week");
        attributes.put("00002a7D-0000-1000-8000-00805f9b34fb", "Descriptor Value Changed");
        attributes.put("00002a00-0000-1000-8000-00805f9b34fb", "Device Name");
        attributes.put("00002a7B-0000-1000-8000-00805f9b34fb", "Dew Point");
        attributes.put("00002a56-0000-1000-8000-00805f9b34fb", "Digital");
        attributes.put("00002a0D-0000-1000-8000-00805f9b34fb", "DST Offset");
        attributes.put("00002a6C-0000-1000-8000-00805f9b34fb", "Elevation");
        attributes.put("00002a87-0000-1000-8000-00805f9b34fb", "Email Address");
        attributes.put("00002a0C-0000-1000-8000-00805f9b34fb", "Exact Time 256");
        attributes.put("00002a88-0000-1000-8000-00805f9b34fb", "Fat Burn Heart Rate Lower Limit");
        attributes.put("00002a89-0000-1000-8000-00805f9b34fb", "Fat Burn Heart Rate Upper Limit");
        attributes.put("00002a26-0000-1000-8000-00805f9b34fb", "Firmware Revision String");
        attributes.put("00002a8A-0000-1000-8000-00805f9b34fb", "First Name");
        attributes.put("0000EE1D-0000-1000-8000-00805f9b34fb", "Fitness Machine Control Point");
        attributes.put("00002a8B-0000-1000-8000-00805f9b34fb", "Five Zone Heart Rate Limits");
        attributes.put("00002aB2-0000-1000-8000-00805f9b34fb", "Floor Number");
        attributes.put("00002a8C-0000-1000-8000-00805f9b34fb", "Gender");
        attributes.put("00002a51-0000-1000-8000-00805f9b34fb", "Glucose Feature");
        attributes.put("00002a18-0000-1000-8000-00805f9b34fb", "Glucose Measurement");
        attributes.put("00002a34-0000-1000-8000-00805f9b34fb", "Glucose Measurement Context");
        attributes.put("00002a74-0000-1000-8000-00805f9b34fb", "Gust Factor");
        attributes.put("00002a27-0000-1000-8000-00805f9b34fb", "Hardware Revision String");
        attributes.put("00002a39-0000-1000-8000-00805f9b34fb", "Heart Rate Control Point");
        attributes.put("00002a8D-0000-1000-8000-00805f9b34fb", "Heart Rate Max");
        attributes.put("00002a37-0000-1000-8000-00805f9b34fb", "Heart Rate Measurement");
        attributes.put("00002a7A-0000-1000-8000-00805f9b34fb", "Heat Index");
        attributes.put("00002a8E-0000-1000-8000-00805f9b34fb", "Height");
        attributes.put("00002a4C-0000-1000-8000-00805f9b34fb", "HID Control Point");
        attributes.put("00002a4A-0000-1000-8000-00805f9b34fb", "HID Information");
        attributes.put("00002a8F-0000-1000-8000-00805f9b34fb", "Hip Circumference");
        attributes.put("00002aBA-0000-1000-8000-00805f9b34fb", "HTTP Control Point");
        attributes.put("00002aB9-0000-1000-8000-00805f9b34fb", "HTTP Entity Body");
        attributes.put("00002aB7-0000-1000-8000-00805f9b34fb", "HTTP Headers");
        attributes.put("00002aB8-0000-1000-8000-00805f9b34fb", "HTTP Status Code");
        attributes.put("00002aBB-0000-1000-8000-00805f9b34fb", "HTTPS Security");
        attributes.put("00002a6F-0000-1000-8000-00805f9b34fb", "Humidity");
        attributes.put("00002a2a-0000-1000-8000-00805f9b34fb", "IEEE 11073-20601 Regulatory Certification Data List");
        attributes.put("00002aAD-0000-1000-8000-00805f9b34fb", "Indoor Positioning Configuration");
        attributes.put("00002a36-0000-1000-8000-00805f9b34fb", "Intermediate Cuff Pressure");
        attributes.put("00002a1E-0000-1000-8000-00805f9b34fb", "Intermediate Temperature");
        attributes.put("00002a77-0000-1000-8000-00805f9b34fb", "Irradiance");
        attributes.put("00002aA2-0000-1000-8000-00805f9b34fb", "Language");
        attributes.put("00002a90-0000-1000-8000-00805f9b34fb", "Last Name");
        attributes.put("00002aAE-0000-1000-8000-00805f9b34fb", "Latitude");
        attributes.put("00002a6B-0000-1000-8000-00805f9b34fb", "LN Control Point");
        attributes.put("00002a6A-0000-1000-8000-00805f9b34fb", "LN Feature");
        attributes.put("00002aB1-0000-1000-8000-00805f9b34fb", "Local East Coordinate");
        attributes.put("00002aB0-0000-1000-8000-00805f9b34fb", "Local North Coordinate");
        attributes.put("00002a0F-0000-1000-8000-00805f9b34fb", "Local Time Information");
        attributes.put("00002a67-0000-1000-8000-00805f9b34fb", "Location and Speed");
        attributes.put("00002aB5-0000-1000-8000-00805f9b34fb", "Location Name");
        attributes.put("00002aAF-0000-1000-8000-00805f9b34fb", "Longitude");
        attributes.put("00002a2C-0000-1000-8000-00805f9b34fb", "Magnetic Declination");
        attributes.put("00002aA0-0000-1000-8000-00805f9b34fb", "Magnetic Flux Density - 2D");
        attributes.put("00002aA1-0000-1000-8000-00805f9b34fb", "Magnetic Flux Density - 3D");
        attributes.put("00002a29-0000-1000-8000-00805f9b34fb", "Manufacturer Name String");
        attributes.put("00002a91-0000-1000-8000-00805f9b34fb", "Maximum Recommended Heart Rate");
        attributes.put("00002a21-0000-1000-8000-00805f9b34fb", "Measurement Interval");
        attributes.put("00002a24-0000-1000-8000-00805f9b34fb", "Model Number String");
        attributes.put("00002a68-0000-1000-8000-00805f9b34fb", "Navigation");
        attributes.put("00002a46-0000-1000-8000-00805f9b34fb", "New Alert");
        attributes.put("00002aC5-0000-1000-8000-00805f9b34fb", "Object Action Control Point");
        attributes.put("00002aC8-0000-1000-8000-00805f9b34fb", "Object Changed");
        attributes.put("00002aC1-0000-1000-8000-00805f9b34fb", "Object First-Created");
        attributes.put("00002aC3-0000-1000-8000-00805f9b34fb", "Object ID");
        attributes.put("00002aC2-0000-1000-8000-00805f9b34fb", "Object Last-Modified");
        attributes.put("00002aC6-0000-1000-8000-00805f9b34fb", "Object List Control Point");
        attributes.put("00002aC7-0000-1000-8000-00805f9b34fb", "Object List Filter");
        attributes.put("00002aBE-0000-1000-8000-00805f9b34fb", "Object Name");
        attributes.put("00002aC4-0000-1000-8000-00805f9b34fb", "Object Properties");
        attributes.put("00002aC0-0000-1000-8000-00805f9b34fb", "Object Size");
        attributes.put("00002aBF-0000-1000-8000-00805f9b34fb", "Object Type");
        attributes.put("00002aBD-0000-1000-8000-00805f9b34fb", "OTS Feature");
        attributes.put("00002a04-0000-1000-8000-00805f9b34fb", "Peripheral Preferred Connection Parameters");
        attributes.put("00002a02-0000-1000-8000-00805f9b34fb", "Peripheral Privacy Flag");
        attributes.put("00002a5F-0000-1000-8000-00805f9b34fb", "PLX Continuous Measurement");
        attributes.put("00002a60-0000-1000-8000-00805f9b34fb", "PLX Features");
        attributes.put("00002a5E-0000-1000-8000-00805f9b34fb", "PLX Spot-Check Measurement");
        attributes.put("00002a50-0000-1000-8000-00805f9b34fb", "PnP ID");
        attributes.put("00002a75-0000-1000-8000-00805f9b34fb", "Pollen Concentration");
        attributes.put("00002a69-0000-1000-8000-00805f9b34fb", "Position Quality");
        attributes.put("00002a6D-0000-1000-8000-00805f9b34fb", "Pressure");
        attributes.put("00002a4E-0000-1000-8000-00805f9b34fb", "Protocol Mode");
        attributes.put("00002a78-0000-1000-8000-00805f9b34fb", "Rainfall");
        attributes.put("00002a03-0000-1000-8000-00805f9b34fb", "Reconnection Address");
        attributes.put("00002a52-0000-1000-8000-00805f9b34fb", "Record Access Control Point");
        attributes.put("00002a14-0000-1000-8000-00805f9b34fb", "Reference Time Information");
        attributes.put("00002a4D-0000-1000-8000-00805f9b34fb", "Report");
        attributes.put("00002a4B-0000-1000-8000-00805f9b34fb", "Report Map");
        attributes.put("00002aC9-0000-1000-8000-00805f9b34fb", "Resolvable Private Address Only");
        attributes.put("00002a92-0000-1000-8000-00805f9b34fb", "Resting Heart Rate");
        attributes.put("00002a40-0000-1000-8000-00805f9b34fb", "Ringer Control Point");
        attributes.put("00002a41-0000-1000-8000-00805f9b34fb", "Ringer Setting");
        attributes.put("00002a54-0000-1000-8000-00805f9b34fb", "RSC Feature");
        attributes.put("00002a53-0000-1000-8000-00805f9b34fb", "RSC Measurement");
        attributes.put("00002a55-0000-1000-8000-00805f9b34fb", "SC Control Point");
        attributes.put("00002a4F-0000-1000-8000-00805f9b34fb", "Scan Interval Window");
        attributes.put("00002a31-0000-1000-8000-00805f9b34fb", "Scan Refresh");
        attributes.put("00002a5D-0000-1000-8000-00805f9b34fb", "Sensor Location");
        attributes.put("00002a25-0000-1000-8000-00805f9b34fb", "Serial Number String");
        attributes.put("00002a05-0000-1000-8000-00805f9b34fb", "Service Changed");
        attributes.put("00002a28-0000-1000-8000-00805f9b34fb", "Software Revision String");
        attributes.put("00002a93-0000-1000-8000-00805f9b34fb", "Sport Type for Aerobic and Anaerobic Thresholds");
        attributes.put("00002a47-0000-1000-8000-00805f9b34fb", "Supported New Alert Category");
        attributes.put("00002a48-0000-1000-8000-00805f9b34fb", "Supported Unread Alert Category");
        attributes.put("00002a23-0000-1000-8000-00805f9b34fb", "System ID");
        attributes.put("00002aBC-0000-1000-8000-00805f9b34fb", "TDS Control Point");
        attributes.put("00002a6E-0000-1000-8000-00805f9b34fb", "Temperature");
        attributes.put("00002a1C-0000-1000-8000-00805f9b34fb", "Temperature Measurement");
        attributes.put("00002a1D-0000-1000-8000-00805f9b34fb", "Temperature Type");
        attributes.put("00002a94-0000-1000-8000-00805f9b34fb", "Three Zone Heart Rate Limits");
        attributes.put("00002a12-0000-1000-8000-00805f9b34fb", "Time Accuracy");
        attributes.put("00002a13-0000-1000-8000-00805f9b34fb", "Time Source");
        attributes.put("00002a16-0000-1000-8000-00805f9b34fb", "Time Update Control Point");
        attributes.put("00002a17-0000-1000-8000-00805f9b34fb", "Time Update State");
        attributes.put("00002a11-0000-1000-8000-00805f9b34fb", "Time with DST");
        attributes.put("00002a0E-0000-1000-8000-00805f9b34fb", "Time Zone");
        attributes.put("00002a71-0000-1000-8000-00805f9b34fb", "True Wind Direction");
        attributes.put("00002a70-0000-1000-8000-00805f9b34fb", "True Wind Speed");
        attributes.put("00002a95-0000-1000-8000-00805f9b34fb", "Two Zone Heart Rate Limit");
        attributes.put("00002a07-0000-1000-8000-00805f9b34fb", "Tx Power Level");
        attributes.put("00002aB4-0000-1000-8000-00805f9b34fb", "Uncertainty");
        attributes.put("00002a45-0000-1000-8000-00805f9b34fb", "Unread Alert Status");
        attributes.put("00002aB6-0000-1000-8000-00805f9b34fb", "URI");
        attributes.put("00002a9F-0000-1000-8000-00805f9b34fb", "User Control Point");
        attributes.put("00002a9A-0000-1000-8000-00805f9b34fb", "User Index");
        attributes.put("00002a76-0000-1000-8000-00805f9b34fb", "UV Index");
        attributes.put("00002a96-0000-1000-8000-00805f9b34fb", "VO2 Max");
        attributes.put("00002a97-0000-1000-8000-00805f9b34fb", "Waist Circumference");
        attributes.put("00002a98-0000-1000-8000-00805f9b34fb", "Weight");
        attributes.put("00002a9D-0000-1000-8000-00805f9b34fb", "Weight Measurement");
        attributes.put("00002a9E-0000-1000-8000-00805f9b34fb", "Weight Scale Feature");
        attributes.put("00002a79-0000-1000-8000-00805f9b34fb", "Wind Chill");

        //extra services
        attributes.put("00001811-0000-1000-8000-00805f9b34fb", "Alert Notification Service");
        attributes.put("00001815-0000-1000-8000-00805f9b34fb", "Automation IO");
        attributes.put("0000180F-0000-1000-8000-00805f9b34fb", "Battery Service");
        attributes.put("00001810-0000-1000-8000-00805f9b34fb", "Blood Pressure");
        attributes.put("0000181B-0000-1000-8000-00805f9b34fb", "Body Composition");
        attributes.put("0000181E-0000-1000-8000-00805f9b34fb", "Bond Management");
        attributes.put("0000181F-0000-1000-8000-00805f9b34fb", "Continuous Glucose Monitoring");
        attributes.put("00001805-0000-1000-8000-00805f9b34fb", "Current Time Service");
        attributes.put("00001818-0000-1000-8000-00805f9b34fb", "Cycling Power");
        attributes.put("00001816-0000-1000-8000-00805f9b34fb", "Cycling Speed and Cadence");
        attributes.put("0000180A-0000-1000-8000-00805f9b34fb", "Device Information");
        attributes.put("0000181A-0000-1000-8000-00805f9b34fb", "Environmental Sensing");
        attributes.put("00001800-0000-1000-8000-00805f9b34fb", "Generic Access");
        attributes.put("00001801-0000-1000-8000-00805f9b34fb", "Generic Attribute");
        attributes.put("00001808-0000-1000-8000-00805f9b34fb", "Glucose");
        attributes.put("00001809-0000-1000-8000-00805f9b34fb", "Health Thermometer");
        attributes.put("0000180D-0000-1000-8000-00805f9b34fb", "Heart Rate");
        attributes.put("00001823-0000-1000-8000-00805f9b34fb", "HTTP Proxy");
        attributes.put("00001812-0000-1000-8000-00805f9b34fb", "Human Interface Device");
        attributes.put("00001802-0000-1000-8000-00805f9b34fb", "Immediate Alert");
        attributes.put("00001821-0000-1000-8000-00805f9b34fb", "Indoor Positioning");
        attributes.put("00001820-0000-1000-8000-00805f9b34fb", "Internet Protocol Support");
        attributes.put("00001803-0000-1000-8000-00805f9b34fb", "Link Loss");
        attributes.put("00001819-0000-1000-8000-00805f9b34fb", "Location and Navigation");
        attributes.put("00001807-0000-1000-8000-00805f9b34fb", "Next DST Change Service");
        attributes.put("00001825-0000-1000-8000-00805f9b34fb", "Object Transfer");
        attributes.put("0000180E-0000-1000-8000-00805f9b34fb", "Phone Alert Status Service");
        attributes.put("00001822-0000-1000-8000-00805f9b34fb", "Pulse Oximeter");
        attributes.put("00001806-0000-1000-8000-00805f9b34fb", "Reference Time Update Service");
        attributes.put("00001814-0000-1000-8000-00805f9b34fb", "Running Speed and Cadence");
        attributes.put("00001813-0000-1000-8000-00805f9b34fb", "Scan Parameters");
        attributes.put("00001824-0000-1000-8000-00805f9b34fb", "Transport Discovery");
        attributes.put("00001804-0000-1000-8000-00805f9b34fb", "Tx Power");
        attributes.put("0000181C-0000-1000-8000-00805f9b34fb", "User Data");
        attributes.put("0000181D-0000-1000-8000-00805f9b34fb", "Weight Scale");
    }

    public static String lookup(String uuid, String defaultName)
    {
        String name = attributes.get(uuid);
        return name == null ? defaultName : name;
    }
}
