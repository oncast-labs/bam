var signatureData = "";
var signaturePicture = "";

$(document).ready(function () {
    //alert("document ready");

    if ($('#timeout').val() == "0") {
        waitUntilTabletManagerIsActive();
    }

    var counter = parseInt($('#hiddenTotalSignatures').val());
    for (i = counter + 1; i <= 16; i++) {
        $("#imgSignature" + (i + 1)).parent().addClass("hidden");
    }

    $('#signaturePanel').removeClass("hidden");
});

function waitUntilTabletManagerIsActive() {
   // alert("waitUntilTabletManagerIsActive");


    try {
        if (tabletManager.isActive()) {
            init();
            enroll();
        }
        else {
            setTimeout(waitUntilTabletManagerIsActive(), 5000)
        }
    }
    catch (e) {
        waitUntilTabletManagerIsActive();
    }
    
}

function init() {
    // alert("init");

    tabletManager.initDeviceManager('http://testserver:50200/TabletManager/Config/tablet.xml', 'http://testserver:50200/TabletManager/', 'en');
}

function enroll() {
    // alert("enroll");

    tabletManager.captureSignature('TabletManager1', 'Please sign here:');
}

function signatureCaptured(appletId) {
    // alert("signatureCaptured");
    tabletManager.display_Idle_Image();

    var signatureData = tabletManager.get_Signature_For_Applet_With_Id('TabletManager1');

    // replace < and > with the corresponding html entities
    signatureData = signatureData.replace(/</g, "&lt;");
    signatureData = signatureData.replace(/>/g, "&gt;");

    $("#hiddenSignatureData").val(signatureData);

    $("#hiddenSignaturePicture").val(tabletManager.get_Signature_Image_As_Base64_String());
    $("#btnProcessSignature").click();
}

function timedOut(appletId) {
    // alert("timedOut");

    tabletManager.display_Idle_Image();
    $('#timeout').val("1");
    alert('Timeout');
    $('#btnTimeout').click();
}


function panelLoaded() {
    // alert("panelLoaded");

    if (parseInt($("#hiddenCounter").val()) <= parseInt($("#hiddenTotalSignatures").val()) && parseInt($("#hiddenCounter").val()) != 0) {
        if ($('#timeout').val() == "0") {
            enroll();
        }
    }
    displaySignatureImage();
}

function displaySignatureImage() {
   // alert("displaySignatureImage");

    var counter = parseInt($('#hiddenCounter').val());
    var totalSignatures = parseInt($('#hiddenTotalSignatures').val());

    if (counter >= 6) {
        $("#imgSignature" + (counter + 1)).parent().removeClass("hidden");
    }
}

function CloseWindow(strReason, requestId) {
    try {
        var queryStr = getQueryVariable("callbackfunction");
        if (queryStr != null && queryStr.length > 0) {
            eval('window.opener.' + getQueryVariable('callbackfunction') + '("' + strReason + '", "' + requestId + '")');
        }
    }
    catch (e) {
        alert(e.message);
    }
    window.open('', '_self');
    window.returnValue = strReason;
    window.close();
}

function getQueryVariable(variable) {
    var query = window.location.search.substring(1);
    var vars = query.split("&");
    for (var i = 0; i < vars.length; i++) {
        var pair = vars[i].split("=");
        if (pair[0] == variable) {
            return pair[1];
        }
    }
    return null;
}
