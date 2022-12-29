import os,shutil

def main():
    folder_size = 2
    #cur_path = os.getcwd()
    cur_path = r'E:\selected_copy'

    files = os.listdir(cur_path)

    dir_list = os.listdir(cur_path)
    #dir_list.remove('start.py')
    print("Path is ",cur_path)
    folder_number = 1
    folder_count = len(dir_list) / folder_size
    # prints all files
    #create folders repeatedly
    count = 1
    try:
        path = os.path.join(cur_path, str(folder_number))
        shutil.rmtree(path, ignore_errors=False)
    except:
        print('folder creation failed')
        os.mkdir(path)


    for item in files:
        path = os.path.join(cur_path, str(folder_number))
        path1 = os.path.join(cur_path, item)
        if ( len(os.listdir(path)) < folder_size ):
            print("came inside")
            
            print(os.path.abspath(item))
            shutil.move(path1, path)
            print("item moved")
        else:    
            folder_number = folder_number + 1
            path = os.path.join(cur_path, str(folder_number))
            try:
                ##delete_folder
                print('Delete folder')
                shutil.rmtree(path, ignore_errors=False)
            except:
                print('creating folder')
            os.mkdir(path)
            shutil.move(path1, path)

if __name__ == '__main__':
    main()