
import {Formik,Form,Field,ErrorMessage} from 'formik';
import * as yup from 'yup';
function Signup()
{
    const defaultValues={
        name:"",
        email:"",
        password:"",
        gender:""
    }

    const validationSchema= yup.object().shape({
        name: yup.string().required('Name is mandatory'),
        email:yup.string().required('Email is mandatory').email('Insert valid email'),
        password: yup.string().required('password is mandatory').min(6).max(20),
        gender: yup.string().required('gender is mandatory')
})

    const handleSubmit=(values)=>
    {
      console.log('values',values);
    }
    return (
        <>
        <h1>Sign Up</h1>
        <Formik initialValues={defaultValues} 
        validationSchema={validationSchema}
        onSubmit={handleSubmit}>

            <Form>
                <Field type="text" name="name" placeholder='Enter the name' className="form-control mt-4"/>
                <p className="text-danger">
                    <ErrorMessage name="name"/>
                </p>
                
                <Field type="text" name="email" placeholder='Enter the email' className="form-control mt-4"/>
                <p className="text-danger">
                    <ErrorMessage name="email"/>
                </p> 
               
                <Field type="password" name="password" placeholder='Enter the password' className="form-control mt-4"/>
                <p className="text-danger">
                    <ErrorMessage name="password"/>
                </p>
                <Field component="select" name="gender" className="form-control mt-4">
                    <option value="disabled">please select</option>
                    <option value="male">MALE</option>
                    <option value="female">FEMALE</option>
                </Field>
                <p className="text-danger">
                    <ErrorMessage name="gender"/>
                </p>
               
                <input type="submit"  className="btn btn-primary w-100 mt-4" value="submit"/>    
            </Form>    
        </Formik>    
        </>
    )
}

export default Signup;
