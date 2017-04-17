function buildTable() {
    $.getJSON('http://localhost:8080/api/employee/', {
        ajax: 'true'
    }, function (data) {
        console.log(data)
        $.each(data, function(index, single) {
            var fullName = single.firstName + ' ' + single.lastName;
            $('#employee-table').find('tbody')
                .append("<tr>" +
                "<td>" + single.id + "</td>" +
                "<td>" + single.firstName + " " + single.lastName + "</td>" +
                "<td>" + single.background + "</td>" +
                "<td>" + "<select><option>(Select Project></option></select>" + "</td>" +
                "<td>" + "<button onclick='editEmployee(" + single.id + ")'>Edit</button>" + "</td>" +
                "<td>" + "<button onclick='deleteEmployee(" + single.id + ")'>Delete</button>" + "</td>" +
                "</tr>");
        });
    });
}

function saveEmployee() {
    var firstName = $('#inputFirstName').val();
    var lastName = $('#inputLastName').val();
    var background = $('#textAreaBackground').val();


    //creating an object in json
    var employee = {
        id: id,
        version: version,
        firstName: firstname,
        lastName: lastName,
        background: background,
        project: []
    }

    console.log(employee);
}